package devheverton.machado.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayListOf(

        "Não terás outros deuses diante de mim",
        "Não farás para ti imagem esculpida, nem figura alguma do que há em cima nos céu embaixo na terra, nem nas águas debaixo da terra",
        "Não tomarás o nome do Senhor, teu Deus, em vão",
        "Não tomarás o nome do Senhor, teu Deus, em vão",
        "Honra a teu pai e a tua mãe, para que se prolonguem os teus dias na terra que o Senhor, teu Deus, te dá.",
        "Não matarás.",
        "Não adulterarás.",
        "Não furtarás.",
        "Não dirás falso testemunho contra o teu próximo,",
        "Não cobiçarás a casa do teu próximo; não cobiçarás a mulher do teu próximo, nem o seu servo, nem a sua serva, nem o seu boi, nem o seu jumento, nem coisa alguma do teu próximo.",
        "É importante observar que a ordem e a forma como esses mandamentos são numerados podem variar ligeiramente entre diferentes tradições religiosas, como o Judaísmo e as diversas denominações do Cristianismo. Além disso, as interpretações e ênfases sobre esses mandamentos também podem diferir."

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById<TextView>(R.id.text_Frase)

    }

    fun gerarFrase(view: View){
        val totalIntegerArray = frases.size
        val numeroAleatorio = java.util.Random().nextInt(totalIntegerArray)
        texto.setText(frases[numeroAleatorio])



    }


}