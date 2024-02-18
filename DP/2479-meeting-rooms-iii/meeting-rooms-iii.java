class Solution {
    public int mostBooked(int n, int[][] meetings) {
    Arrays.sort(meetings, Comparator.comparing(meeting -> meeting[0]));
    Comparator<Meeting> meetingComparator = Comparator.comparing(Meeting::to).thenComparing(Meeting::room);
    PriorityQueue<Meeting> currentMeetings = new PriorityQueue<>(meetingComparator);
    PriorityQueue<Integer> availableRooms = rooms(n);
    Map<Integer, Integer> roomFrequency = new HashMap<>();
    int maxFrequencyRoom = 0;

    for (int[] nextMeeting : meetings) {
      int nextMeetingStart = nextMeeting[0], nextMeetingFinish = nextMeeting[1];
      while (!currentMeetings.isEmpty() && currentMeetings.peek().to() <= nextMeetingStart) {
        Meeting meeting = currentMeetings.poll();
        availableRooms.offer(meeting.room());
      }

      if (!availableRooms.isEmpty()) {
        int room = availableRooms.poll();
        currentMeetings.offer(new Meeting(nextMeetingFinish, room));
        maxFrequencyRoom = updateMaxFrequencyRoom(roomFrequency, room, maxFrequencyRoom);
      } else {
        Meeting previousMeeting = currentMeetings.poll();
        int room = previousMeeting.room();
        int duration = nextMeetingFinish - nextMeetingStart;
        currentMeetings.offer(new Meeting(previousMeeting.to() + duration, room));
        maxFrequencyRoom = updateMaxFrequencyRoom(roomFrequency, room, maxFrequencyRoom);
      }
    }

    return maxFrequencyRoom;
  }

  private int updateMaxFrequencyRoom(Map<Integer, Integer> roomFrequency, int room, int maxFrequencyRoom) {
    roomFrequency.merge(room, 1, Integer::sum);
    int currentFrequency = roomFrequency.get(room);
    int maxFrequency = roomFrequency.getOrDefault(maxFrequencyRoom, Integer.MIN_VALUE);

    if (currentFrequency > maxFrequency) {
      return room;
    } else if (currentFrequency == maxFrequency)
      return Math.min(room, maxFrequencyRoom);

    return maxFrequencyRoom;
  }
  private PriorityQueue<Integer> rooms(int n) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for (int i = 0; i < n; ++i) {
      queue.offer(i);
    }
    return queue;
  }

  private record Meeting(long to, int room) {
  }
}