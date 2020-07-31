package Aula07;

class Ex02 {
    public static void main(String[] args) {
        Integer productQty = 15;

        Thread user1 = new Thread(new Order(1, productQty));
        user1.run();
    }
}

class Order implements Runnable{
    public Order(Integer customerId, Integer productQty) {
        if(productQty > 0){
            productQty--;
            System.out.println("Pedido faturado para o Cliente: " + customerId);
        } else {
            System.out.println("Nao tem estoque para o client: " + customerId);
        }
    }

    @Override
    public void run() {

    }
}
