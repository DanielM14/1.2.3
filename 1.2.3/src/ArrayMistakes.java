import static java.lang.System.*;

public class ArrayMistakes
{
    public static void main(String args[])
    {
        int [] nums = new int[] {6, 9, 14, 19};

        out.print("\nForward");
        for (int i = 0; nums.length > i; i++) {
            out.print(": " + nums[i]);
        }
        int [] nums2 = new int[] {19, 14, 9, 6};

        out.print("\nBackward" );
        for (int j = 3; j>= 0; --j) {
            out.print( ": " + nums[j]);
        }
    }
}