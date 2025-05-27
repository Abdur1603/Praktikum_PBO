package models;

public class Customer extends Person{

    public Customer(String username, String password) {
        super(username, password);
    }

    public void register() {
        System.out.println("Customer " + username + " berhasil register.");
    }

    private int generateIdTransaksi() {
        return Transaksi.getDaftarTransaksi().size() + 1;
    }
    
    public void pesanKue(Kue kue, int jumlah) {
    if (jumlah <= 0) {
        System.out.println("Jumlah harus lebih dari 0.");
        return;
    }
    if (jumlah > kue.getStok()) {
        System.out.println("Stok tidak mencukupi.");
        return;
    }
    kue.updateStok(kue.getStok() - jumlah);
    int newId = generateIdTransaksi();
    Transaksi trx = new Transaksi(newId, this.username);
    trx.tambahKue(kue.getNamaKue(), jumlah, kue.getHarga());
    trx.hitungTotal();
    System.out.println(trx.cetakNota());
}


    public String getName() {
        return username;
    }
}
