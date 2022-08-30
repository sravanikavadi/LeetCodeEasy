package org.LeetCodeEasy;

import java.util.Arrays;

/**
 * Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.
 * https://leetcode.com/problems/meeting-rooms/
 */
public class MeetingRoomEasy {
    public static void main(String args[]){
        int[][] intervals = {{7,10},{2,4}}; //true
                //{{0,30}, {5,10}, {15,20}}; //false
        System.out.println("Can a person can attend all meeting? "+ canAttendAllMeetings(intervals));
    }
    public static boolean canAttendAllMeetings(int[][] intervals){
        Arrays.sort(intervals,(a,b)-> a[0] -b[0]);
        for(int i=0; i<intervals.length-1; i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }
}
