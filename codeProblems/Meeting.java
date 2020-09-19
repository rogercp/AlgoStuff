import java.util.*;

// Your company built an in-house calendar tool called HiCal. You want to add a feature to see the times 
// in a day when everyone is available.

// To do this, you’ll need to know when any team is having a meeting. In HiCal, a meeting is stored as 
// an object of a Meeting class with integer variables startTime and endTime. These integers represent the number of 30-minute blocks past 9:00am.

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

        //create new arraylist to add to and return 
        ArrayList<Meeting> returnArr = new ArrayList<Meeting>();

        //first sort the arraylist of objects based on the starttime of each meeting
        meetingList.sort(Comparator.comparing(Meeting::getStartTime));

        //set up a temporary object where one meeting gets held
        //this will be used to compare later on in the loop 
        Meeting lastMergedorUnmergedMeeting = meetingList.get(0); 

        //set up a pointer for the loop starting at the next meeting time
        int i= 1;

        //loop through the og meetinglist until the pointer reaches the end
        while(i < meetingList.size())
        {

            //isolate the current meeting object at the current index
            Meeting second = meetingList.get(i); 

            //run this block if the first saved meeting object's endtime is greater than or equal to than the seconds starttime
            //this means we get to merge two meeting times 
            if(lastMergedorUnmergedMeeting.getEndTime() >= second.getStartTime())
            {
                //in order to merge we need the biggest end time of both the meetings
                int maximum = Math.max(lastMergedorUnmergedMeeting.getEndTime(),second.getEndTime());

                //we create a new meeting with the start if the first saved meeting and the biggest endtime from both
                Meeting newMeeting = new Meeting(lastMergedorUnmergedMeeting.getStartTime(),maximum);

                //now we set the first meeting outside of our while loop to the new meeting created
                lastMergedorUnmergedMeeting = newMeeting;

                //we increment the pointer
                i++;


            }

            //if the block above doesnt run 
            else
            {


                // we go ahead and add that first meeting we created outside of our loop
                // because it the second meeting is not mergable with the first
                returnArr.add(lastMergedorUnmergedMeeting);

                // now we have to set our first meeting outside the loop to the current meeting inside our
                // loop also known as the second meeting because our previous meeting outside out loop
                //is no longer useful for comparing because its been added to our returnArr
                lastMergedorUnmergedMeeting = new Meeting(second.getStartTime(),second.getEndTime());

                //still need to increment the pointer
               i++;


            }


        }

        // we need to add the last meeting to our returnArr because 
        // we wont have the oppurtunity to add it inside our loop on the last go
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












