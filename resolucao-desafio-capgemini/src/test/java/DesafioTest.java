import br.com.proway.capgemini.Desafio;
import org.junit.jupiter.api.Test;

public class DesafioTest {

    Desafio desafio = new Desafio();

    @Test
    public void devePrintarNEstrelas(){
        desafio.questaoUm();
    }

    @Test
    public void devePrintarSenhaForte(){
        desafio.questaoDois("Teste@BiBiBi");
    }

    @Test
    public void devePrintarSenhaFraca(){
        desafio.questaoDois("BiBiBre");
    }

    @Test
    public void devePrintarQuatidadeFaltanteDeCharacteres(){
        desafio.questaoDois("BiBrenDaBibi2022");
    }

    @Test
    public void devePrintarQuantidadeDeAnagramas(){
        desafio.questaoTres("SoumTesteDeAnagrama");
    }

}
