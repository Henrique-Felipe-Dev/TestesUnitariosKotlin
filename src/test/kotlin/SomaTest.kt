//Importamos exatamente a anotação Test da biblioteca do Junit
import org.junit.jupiter.api.Test
//Nós importamos o assertEquals da bliblioteca de test do Kotlin
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

internal class SomaTest{

    //Nós instânciamos a nossa classe que queremos testar
    val soma = Soma()

    //Nós utilizamos a anotação @Test para nosso programa entender que a função
    //que utilizaremos será um teste unitário
    @Test
    //A função que vai receber o teste unitário
    fun sumNumTest(){
        //Fizemos o uso do assertEquals para verificar se quando chamarmos a nossa
        //função ela vai retornar exatamente aquilo que esperamos
        /*
        Se quando chamamos a nossa função e passamos os parâmetros 2 e 6, ele retorna
        8
         */
        assertEquals(8, soma.sumNum(2, 6))
    }

    @Test
    fun verificarNumNegativoTest(){
        assertEquals(true, soma.verificarNumNegativo(1))
    }



}