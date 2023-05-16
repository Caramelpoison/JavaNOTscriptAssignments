import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> IOU;
    public IOU(){
        IOU = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        IOU.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        for (String key : IOU.keySet()) {
            if (key.contains(toWhom)) {
                return IOU.get(key);
            }
        }
        return 0;
    }
}
