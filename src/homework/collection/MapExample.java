package homework.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
//        List<FootballTeamMember> members = new ArrayList<>();
//        members.add(new FootballTeamMember(1, "poxos"));
//        members.add(new FootballTeamMember(2, "petros"));
//        members.add(new FootballTeamMember(3, "kirakos"));
//        members.add(new FootballTeamMember(4, "martiros"));
        Map<Integer, String> membermap = new HashMap<>();
        membermap.put(1, "aaa");
        membermap.put(2, "bbb");
        membermap.put(3, "ccc");

//        createFootballTeam(members);
//        removeFromMap(membermap,5);
//        printAllMemberNames(membermap);
        printAllMembers(membermap);


    }


    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {


        Map<Integer, String> team = new HashMap<>();
        for (FootballTeamMember member : members) {
            team.put(member.getNumber(), member.getName());
        }

        return team;
    }

    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        for (Integer integer : memberMap.keySet()) {
            if (integer == removedNumber) {
                memberMap.remove(integer);
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;

    }


    static void printAllMemberNames(Map<Integer, String> memberMap) {
        System.out.println(memberMap.values());

    }


    static void printAllMembers(Map<Integer, String> memberMap) {
        for (Integer integer : memberMap.keySet()) {
            System.out.println(integer + "  -  " + memberMap.get(integer));
        }
    }


    static class FootballTeamMember {

        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }


}
