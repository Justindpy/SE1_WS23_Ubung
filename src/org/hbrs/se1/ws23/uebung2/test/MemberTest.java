package org.hbrs.se1.ws23.uebung2.test;

import org.hbrs.se1.ws23.uebung2.ConcreteMember;
import org.hbrs.se1.ws23.uebung2.Container;
import org.hbrs.se1.ws23.uebung2.ContainerException;
import org.hbrs.se1.ws23.uebung2.Member;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MemberTest {

    Container container = new Container();
    Member memberOne = new ConcreteMember(1);
    Member memberTwo = new ConcreteMember(2);

    @BeforeEach
    public void insertFirst() throws ContainerException {
        container.addMember(memberTwo);
    }

    @Test
    public void insertOne() throws ContainerException {
        assertDoesNotThrow(() -> container.addMember(memberOne));
    }
    @Test
    public void insertSecond() throws ContainerException {
        assertThrows(ContainerException.class, () -> container.addMember(memberTwo));
    }

    @Test
    public void testSize(){
        assertEquals(1, container.size());
    }

    @Test
    public void insertThird() throws ContainerException {
        container.addMember(memberOne);
        assertThrows(ContainerException.class, () -> container.addMember(memberOne));
    }

    @Test
    public void testSizeSecond() throws ContainerException {
        container.addMember(memberOne);
        assertEquals(2, container.size());
    }
    @Test
    public void deleteFirst() throws ContainerException {
        container.addMember(memberOne);
        assertEquals("1", container.deleteMember(1));
    }

    @Test
    public void deleteSecond(){
        assertEquals("2", container.deleteMember(2));
    }

    @Test
    public void deleteThird(){
        assertEquals("Fehler", container.deleteMember(5));
    }

    @Test
    public void deleteFourth(){
        assertEquals("Fehler", container.deleteMember(-2));
    }

    @Test
    public void deleteAndInsert(){
        container.deleteMember(2);
        assertDoesNotThrow(() -> container.addMember(memberTwo));
    }


}
