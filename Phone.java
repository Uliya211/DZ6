public class Phone {

    private String number;
    private String model;
    private int weight;
    public Phone(){
        System.out.println("\nОбъект установлен");
    }

    public Phone(String number,String model){
        this.number=number;
        this.model=model;
    }
    public Phone(String number, String model, int weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }


    public void receiveCall(String name) {
        System.out.println("Звонит " +name);
    }
    public void info(){
        System.out.printf("Number: %s \tModel: %s \tWeight: %d \n",number, model,weight);
    }


}




