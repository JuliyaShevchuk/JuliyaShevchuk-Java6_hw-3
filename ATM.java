public class ATM {
   public int countBanknotes(int sum){
        int[] number =  {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i=0; int count=0;
        int Resultsum = sum;
        while (i<number.length){
            int j=0;
            while(Resultsum>=number[i]){
                Resultsum=Resultsum-number[i];
                j++;
            }
            count=count+j;
            i++;
        }
        return count;
    }
}
