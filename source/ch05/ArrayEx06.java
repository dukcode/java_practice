// 05-06 ArrayEx06.java
class ArrayEx06
{
    public static void main(String[] args)
    {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int maxScore = score[0];
        int minScore = score[0];

        for (int i = 1; i < score.length; ++i)
        {
            if (score[i] > maxScore)
            {
                maxScore = score[i];
            }

            if (score[i] < minScore)
            {
                minScore = score[i];
            }
        }

        System.out.println("최대값 : " + maxScore);
        System.out.println("최소값 : " + minScore);
    }
}
