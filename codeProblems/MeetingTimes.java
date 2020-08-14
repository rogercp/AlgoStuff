

import java.util.*;



// make a method that takes a list of times of day and sees when everyone is available
public class MeetingTimes
{



public static List<Meeting> mergeRanges(List<Meeting> meetings) {


	// make a copy of the input we will need it
    List<Meeting> sortedMeetings = new ArrayList<>();
    for (Meeting meeting: meetings) {
        Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
        sortedMeetings.add(meetingCopy);
    }

    // sort by the start time 
    Collections.sort(sortedMeetings, new Comparator<Meeting>() {
        @Override
        public int compare(Meeting m1, Meeting m2) {
            return m1.getStartTime() - m2.getStartTime();
        }
    });

    // add the earliest meeting to new mergedmeetings array
    List<Meeting> mergedMeetings = new ArrayList<>();
    mergedMeetings.add(sortedMeetings.get(0));

    for (Meeting currentMeeting : sortedMeetings) {

        Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

        // if the currentMeeting overlaps the last mergedmeeting then use the later time of both
    
        if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
            lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

            // add the current meeting if it doesnt overlap
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