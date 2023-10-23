package org.hbrs.se1.ws23.uebung2;

import java.util.ArrayList;
import java.util.List;

public class Container {

    private List<Member> memberList;

    public Container(){
        memberList = new ArrayList<>();
    }

    public Container(Member member){
        memberList = new ArrayList<>();
        memberList.add(member);
    }

    private boolean checkSameID(Member member) throws ContainerException {
        boolean check = false;
        for (int i = 0; i < memberList.size(); i++){
            if(member.getID() == memberList.get(i).getID()) throw new ContainerException(member.getID());
        }
        check = true;
        return check;
    }

    public void addMember(Member member) throws ContainerException {
        checkSameID(member);
        memberList.add(member);
    }

    private int findMember(Integer id){
        int index = 0;
        for (index = 0; index < memberList.size(); index++){
           if(memberList.get(index).getID() == id) break;
        }
        if(index == memberList.size()){
            return Integer.MAX_VALUE;
        }
        return index;
    }

    public String deleteMember(Integer id){
        if (findMember(id) == Integer.MAX_VALUE){
            return "Fehler";
        }else {
            memberList.remove(findMember(id));
            return String.valueOf(id);
        }
    }

    public void dump(){
        for(int i = 0; i < memberList.size(); i++){
            System.out.println(memberList.get(i).toString());
        }
    }

    public int size(){
        return memberList.size();
    }

}
