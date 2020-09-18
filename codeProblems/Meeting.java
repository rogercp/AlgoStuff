import java.util.*;

  public class Meeting {


    private int startTime;
    private int endTime;


    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }


    public int getStartTime() {
        return startTime;
    }


    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }


    public int getEndTime() {
        return endTime;
    }


    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


    public static ArrayList<Meeting> mergeRanges( ArrayList<Meeting>meetingList)
    {

        ArrayList<Meeting> returnArr = new ArrayList<Meeting>();

        meetingList.sort(Comparator.comparing(Meeting::getStartTime));

        Meeting lastMergedorUnmergedMeeting = meetingList.get(0); //(3,8)

        int i= 1;

        while(i < meetingList.size())
        {

            // Meeting first = meetingList.get(i);
            Meeting second = meetingList.get(i); 


            if(lastMergedorUnmergedMeeting.getEndTime() >= second.getStartTime())
            {

                int maximum = Math.max(lastMergedorUnmergedMeeting.getEndTime(),second.getEndTime());

                Meeting newMeeting = new Meeting(lastMergedorUnmergedMeeting.getStartTime(),maximum);

                lastMergedorUnmergedMeeting = newMeeting;

                i++;

                continue;
            }
            else
            {

                returnArr.add(lastMergedorUnmergedMeeting);


                lastMergedorUnmergedMeeting = new Meeting(second.getStartTime(),second.getEndTime());


               i++;


            }


        }

        returnArr.add(lastMergedorUnmergedMeeting);


        return returnArr;
    }


    public static void main(String[] args)
    {

        Meeting meeting1 = new Meeting(1, 10);
        Meeting meeting2 = new Meeting(2,6);
         Meeting meeting3 = new Meeting(3,5);
          Meeting meeting4 = new Meeting(7,9);

        // Meeting meeting1 = new Meeting(0, 1);
        //  Meeting meeting2 = new Meeting(3, 5);
        //   Meeting meeting3 = new Meeting(4, 8);
        //    Meeting meeting4 = new Meeting(10, 12);
        //     Meeting meeting5 = new Meeting(9, 10);
    
        ArrayList<Meeting> myMeetings = new ArrayList<Meeting>();

        myMeetings.add(meeting1);
        myMeetings.add(meeting2);
        myMeetings.add(meeting3);
        myMeetings.add(meeting4);
        // myMeetings.add(meeting5);


        ArrayList<Meeting> returnList = mergeRanges(myMeetings);

        for(Meeting c: returnList)
        {
            System.out.println(c.startTime);
            System.out.println(c.endTime);
        }




    }



}












