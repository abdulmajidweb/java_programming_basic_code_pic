class ForContinueLoop{
    public static void main(String[] args){
        int a;
        for(a = 1; a <= 10; a++){
            System.out.println(a);
            if(a <= 6){
                continue;
            }
            else{
                break;
            }
        }
    }
}

