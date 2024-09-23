import java.util.*;
class HighestAltitude{
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAlt = 0;
        for (int change : gain) {
            altitude += change;
            maxAlt = Math.max(maxAlt, altitude);
        }
        return maxAlt;
    }
}
