package com.oa;

import java.util.HashMap;

public class MostBookedHotelRoom {

    //This code has been tested || Working

    //https://leetcode.com/discuss/interview-question/421787/

    //https://leetcode.com/playground/ByQW8xQf


    public class Main {
        public void main(String[] args) {
            System.out.println("Hello World!");
            String[] test={"+1A", "+3E", "-1A", "+4F", "+1A", "-3E"};
            String[] test1={"+1A", "+3E", "-1A", "+4F", "+1A", "-3E", "+3E", "-3E"};
            mostBookedHotelRoom(test1);
        }

        public  void mostBookedHotelRoom(String[] booked){
            String most="A";
            int max=0;

            HashMap<String, Integer> record=new HashMap<>();
            for(String s:booked){
                String room=s.substring(1);
                if(record.containsKey(room)){
                    if(s.substring(0,1).equals("+")) record.put(room, record.get(room)+1);
                }else{
                    if(s.substring(0,1).equals("+")) record.put(room, 1);
                    else record.put(room, 0);
                }
            }

            for(String room:record.keySet()){
                if(record.get(room)>max) {
                    max=record.get(room);
                    most=room;
                } else if(record.get(room)==max){
                    if(room.charAt(room.length()-1)>most.charAt(room.length()-1)){
                        max=record.get(room);
                        most=room;
                    }
                }
            }


            System.out.println(most);

        }
    }

    /*public static String solution(String[] floors)
    {
        int[] map = new int[260];
        int max = 0;
        String currentMax = floors[0];

        for (int i = 0; i < floors.length; i++)
        {
            String currentRoom = floors[i];
            if (currentRoom.charAt(0) == '-') continue;
            int idx = (1 + currentRoom.charAt(1) - '0') * (1 + currentRoom.charAt(2) - 'A') - 1;
            map[idx]++;
            if (map[idx] > max)
            {
                max = map[idx];
                currentMax = currentRoom;
            }
            else if (map[idx] == max)
            {
                currentMax = currentMax.compareTo(currentRoom) < 0 ? currentMax : currentRoom;
            }
        }

        return currentMax.substring(1);
    }*/
}
