package com.example.b40.coding2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    private List<ItemModel> itemModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        itemModelList = new ArrayList<>();

        itemModelList.add(new ItemModel("God Martial Arts", "Setelah mengalami kematian karena kecelakaan mobil “lin feng”\n melintasi dunia dan menemukan kalau dirinya di dunia lain\n dalam keadaan hampir mati, karena itulah ia \nberhasil mendapatkan kesempatan untuk hidup kedua kalinya.\n dengan kehidupan barunya sebagai tuan muda lin \ndari klan lin apakah ia berhasil menjadi seorang seniman beladiri \nyang hebat dan berhasilkah ia membalaskan orang-orang yg membully \ndirinya dulu?", R.drawable.gma));
        itemModelList.add(new ItemModel("Battlet trought the heaven", "Di negeri di mana ada keajaiban hadir. Sebuah daratan\n di mana yang kuat membuat aturan dan yang lemah\n harus mematuhi. Sebuah daratan yang penuh dengan\n harta memikat dan kecantikan namun juga penuh dengan\n bahaya yang tak terduga. Xiao Yan, yang telah menunjukkan\n bakat tidak pernah terlihat dalam beberapa dekade, \ntiba-tiba tiga tahun lalu kehilangan segalanya, \nkekuatannya, reputasinya, dan janjinya untuk ibunya\n. Apa sihir telah menyebabkan dia kehilangan semua kekuatannya?\n Dan mengapa tunangannya tiba-tiba muncul?", R.drawable.btth));
        itemModelList.add(new ItemModel("Chaotic Sword God", "Jian Chen, diakui publik ahli # 1 di dunia bawah. \nteknik pedang cepat nya mencapai \nkesempurnaan dan tidak ada yang bisa mengalahkannya. \nSetelah satu pertempuran dengan ahli yang luar biasa,\n Dugu Qiubai, yang menghilang selama \nseratus tahun, tubuhnya meninggal dan ia meninggal.\n Setelah kematian, jiwa Jian Chen telah \nbereinkarnasi ke dunia asing. Dia mengalami banyak hal,\n kehidupan, kematian dan segala sesuatu di antaranya. \nBergabung dengan kami untuk perjalanan!", R.drawable.csg));
        itemModelList.add(new ItemModel("Tales of Demons And Gods", "Nie Lie, Demon Spiritist yang terkuat dikehidupan masa lalunya\n yang berdiri di puncak dunia persilatan, namun dia kehilangan\n nyawanya saat pertarungan dengan Sage Emperor dan keenam dewa\n berperingkat binatang, jiwanya kemudian terlahir kembali\n saat dia masih berumur 13 tahun. Meskipun dia yang \npaling lemah di kelasnya dengan bakat terendah\n hanya diranah Red soul, tapi dengan bantuan\n pengetahuan yang luas yang dia akumulasi\n dari kehidupan sebelumnya, dia terlatih\n begitu cepat dari pada siapapun. Mencoba untuk \nmelindungi kota di masa mendatang sedang diserang oleh\n binatang dan akhirnya hancur, serta melindungi \nkekasihnya, teman-temannya dan keluarganya yang meninggal\n karena serangan binatang. Dan untuk menghancurkan \nkeluarga Sacred yang meninggalkan tugas mereka dan\n kota yang dikhianati dalam kehidupan masa lalunya.", R.drawable.tgd));
        itemModelList.add(new ItemModel("Haikyuu", "Bercerita tentang seorang pemuda bernama Hinata Shouyou.\n Dia bersumpah untuk membalas kekalahannya di turnamen\n Bola Voli tingkat SMP oleh Kageyama Tobio, seorang pemain\n yang dijuluki Raja Lapangan. Namun, ketika\n hendak bergabung dengan Klub Bola Voli SMA\n Karasuno, dia menemukan bahwa ternyata Tobio\n juga ada di situ…", R.drawable.h));
        itemModelList.add(new ItemModel("Air Gear", "Cerita berawal ketika seorang remaja SMA bernama Minami Itsuki (Ikki)\n dihajar oleh berandalan yang menggunakan Air Treck, \nsemacam sepatu roda yang bermesin. Dia penasaran \ndan mencoba menggunakan dan belajar seluk beluk\n Air Treck. Ternyata Ikki memiliki bakat\n terpendam dalam hal ini. Dia lalu berhasil\n membalas perlakuannya pada geng yang dulu menghajarnya.\n Dimulailah petualangan Ikki menjadi Trecker terkuat", R.drawable.ag));
        itemModelList.add(new ItemModel("Black Clover", "Aster dan Yuno ditelantarkan bersama di gereja yang sama.\n Sebagai anak-anak, mereka berjanji bahwa mereka akan\n bersaing satu sama lain untuk melihat siapa yang akan \nmenjadi kaisar sihir berikutnya. Namun, saat mereka dewasa,\n beberapa perbedaan di antara mereka menjadi\n jelas. Yuno adalah seorang jenius dengan sihir,\n dengan kekuasaan dan kontrol menakjubkan, sementara \nAster tidak bisa menggunakan sihir sama sekali,\n dan mencoba untuk menebus kekurangnya dengan melatih\n fisik. Ketika mereka menerima grimoires mereka pada\n usia 15, Yuno mendapat buku yang spektakuler\n dengan empat daun semanggi-(kebanyakan orang menerima\n tiga daun semanggi-), sementara Aster tidak menerima apa-apa sama sekali.\n Namun, ketika Yuno terancam, kebenaran tentang kekuatan Aster \nterungkap– ia menerima grimoire lima daun semanggi-, \nbuku ‘semanggi hitam’ anti-sihir. Sekarang mereka berdua\n melangkah keluar untuk mencari tujuan yang sama!", R.drawable.bc));
        itemModelList.add(new ItemModel("Boku no Hero Academia", "Suatu hari, seorang bocah empat tahun tiba-tiba menyadari:\n dunia tidak adil. Delapan puluh persen populasi dunia \nmenggunakan kemampuan khusus, yang dikenal sebagai\n quirks, yang telah memberi banyak kekuatan untuk membuat\n impian masa kecil mereka menjadi pahlawan super menjadi\n kenyataan. Sayangnya, Izuku Midoriya adalah salah\n satu dari sedikit yang lahir tanpa permainan kata-kata\n, menderita diskriminasi karenanya. Namun, ia menolak \nuntuk menyerah pada impiannya menjadi pahlawan;\n bertekad untuk melakukan hal yang mustahil, Izuku mengarahkan\n perhatiannya pada akademi pelatihan pahlawan elit, UA High.\n Namun, semuanya berubah setelah ada kesempatan bertemu \ndengan pahlawan nomor satu dan idola Izuku, All Might.\n Menemukan bahwa mimpinya bukanlah jalan buntu, bocah tak\n berdaya itu menjalani pelatihan khusus, bekerja lebih \nkeras dari sebelumnya. Akhirnya, ini menyebabkan dia mewarisi\n kekuatan All Might,", R.drawable.bnha));
        recyclerAdapter = new RecyclerAdapter(itemModelList, new RecyclerAdapter.OnCardClickListener() {
            @Override
            public void onClickCard(ItemModel model) {
                Intent intent = new Intent(MainActivity.this, ItemActivity.class);
                intent.putExtra("image", model.getImage());
                intent.putExtra("title", model.getTitle());
                intent.putExtra("sinopsis", model.getSinopsis());
                startActivity(intent);
            }
        });

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(recyclerAdapter);
    }
}