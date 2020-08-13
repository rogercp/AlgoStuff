

import java.util.*;


// find the sloweset key press between presses and return the slowest key


public class MeetingTimes
{



public static List<Meeting> mergeRanges(List<Meeting> meetings) {

    List<Meeting> sortedMeetings = new ArrayList<>();
    for (Meeting meeting: meetings) {
        Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
        sortedMeetings.add(meetingCopy);
    }

    Collections.sort(sortedMeetings, new Comparator<Meeting>() {
        @Override
        public int compare(Meeting m1, Meeting m2) {
            return m1.getStartTime() - m2.getStartTime();
        }
    });

    List<Meeting> mergedMeetings = new ArrayList<>();
    mergedMeetings.add(sortedMeetings.get(0));

    for (Meeting currentMeeting : sortedMeetings) {

        Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

    
        if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
            lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

        } else {
            mergedMeetings.add(currentMeeting);
        }
    }

    return mergedMeetings;
}



	public static void main(String[]args)
	{


		MeetingTimes program = new MeetingTimes();


	}



}