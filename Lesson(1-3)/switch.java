class Switch{
    public static void main(String[] args){
        int mark=80;
        switch(mark){
            case 80:
                System.out.println("A+");
                break;
            case 70:
                System.out.println("A");
                break;
            case 60:
                System.out.println("A-");
                break;
            case 50:
                System.out.println("B");
                break;
            case 40:
                System.out.println("C");
                break;
            case 33:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
