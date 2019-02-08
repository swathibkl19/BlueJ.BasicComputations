public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        System.out.print('\u000C');
        int large= integers[0];
        for(int i=0;i< integers.length;i++) {
            if(large>integers[i])
              large=large;
              else
              large=integers[i];
            }
            System.out.println(large);
            
        return large;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        System.out.print('\u000C');
        
        int large= integers[0];
        for(int i=0;i<integers.length;i++)
        {
           large = Math.max(large,integers[i]);
        }
        System.out.println(large);
        return large;
    }
}

