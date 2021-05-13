import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums){
            if(hashSet.contains(num)){
                return true;
            }
            else {
                hashSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] number = {1,2,3,4};
        boolean hasDuplicate = containsDuplicate.containsDuplicate(number);
        System.out.println(hasDuplicate);
    }

}
