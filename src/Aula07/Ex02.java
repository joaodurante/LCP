package Aula07;

class Ex02 {
    public static void main(String[] args) {
        Integer productQty = 15;
        Product product = new Product(5);
        Thread[] threads = new Thread[15];
        for(int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(product);
            threads[i].setName("Customer"+i);
            threads[i].start();
        }
    }
}

class Product implements Runnable{
    private int productQty;
    public Product(int productQty) {
        this.productQty = productQty;
    }

    @Override
    public void run() {
        try {
            this.validateOrder();
        } catch(Exception e) {
            System.out.println("Error");
        }
    }

    public synchronized void validateOrder() {
        try {
            if(this.productQty > 0) {
                System.out.println("Pedido faturado pelo cliente :" + Thread.currentThread().getName());
                Thread.sleep(100);
                this.productQty--;
            } else {
                System.out.println("Nao tem estoque para o cliente:" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
