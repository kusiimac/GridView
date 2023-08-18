package com.cleo.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cleo.gridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<SellModel>()
        list.add(SellModel(R.drawable.laptop, "A high speed processor laptop with 500GB HDD, 8GB RAM " +
                "at least 5 Hrs battery life. all these at a discounted price", "UGX 700,000"))

        list.add(SellModel(R.drawable.tv, "This full HDD TV comes with 2 USB ports, 3 HDMI ports," +
                "a wall mount bracket and 5 years warrant card", "UGX 600,000"))

        list.add(SellModel(R.drawable.selfie_stick, "Feel the touch of your great lens by taking pics at every " +
                "the most acute angle. This is the future of photography on mobile phones", "UGX 40,000"))

        list.add(SellModel(R.drawable.mixer, "A great tool for professional DJs and great entertainment " +
                "feeling with a better sound output to produce the best sound", "UGX 1,500,000"))

        list.add(SellModel(R.drawable.earpods, "Music on the go. Enjoy that heavy punch base and feel every " +
                "aspect of your music with a balance sound output", "UGX 120,000"))

        list.add(SellModel(R.drawable.home_theater, "Every home needs an entertainment set like this great " +
                "home theater that,s built to perfection. Relax your mind with a great sound", "UGX 500,000"))

        list.add(SellModel(R.drawable.hoofer, "Every home needs an entertainment set like this great" +
                "home theater that,s built to perfection. Relax your mind with a great sound", "UGX 250,000"))

        list.add(SellModel(R.drawable.phone, "An elegant smartphone samsung galaxy series with  500GB of " +
                "internal memory, 8GB RAM and a long last battery of 45000mAh", "UGX 600,000"))

        val gridAdapter = MyAdapter(this, list)
        val gridView = binding.gridView
        gridView.adapter = gridAdapter
    }
}