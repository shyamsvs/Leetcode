import java.util.HashSet;

public class ContainsDuplicate {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        int answer = 0;
        for (int num : nums){
            if(hashSet.contains(num)){
                if(!hashSet1.contains(num)){
                    hashSet1.add(num);
                }
            }
            else {
                hashSet.add(num);
                answer = answer + num;
            }
        }
        for (int hash : hashSet1){
            answer = answer - hash;
        }
        return Math.max(answer, 0);
    }

    public static void main(String[] args){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] number = {1,1,1,1};
        int sum = containsDuplicate.sumOfUnique(number);
        System.out.println(sum);
    }

}
