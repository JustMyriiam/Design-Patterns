

public class Factory {
    
    
    public Knife create(String type) {
        Knife K;
        if (type == null || type.isEmpty()){
            return null;
        }
        else if (type.equals("SteakKnife")){
            K = new SteakKnife();
        } else if (type.equals("CheeseKnife")) {
            K = new CheeseKnife();
        } else {
            throw new IllegalArgumentException("Unknown Knife Type:"+type);
        }
         
        return K;
    }  
}
