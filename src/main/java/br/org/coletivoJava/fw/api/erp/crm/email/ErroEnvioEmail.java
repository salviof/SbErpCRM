/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package br.org.coletivoJava.fw.api.erp.crm.email;

/**
 *
 * @author desenvolvedor
 */
public class ErroEnvioEmail extends Throwable {

    private final String mensagemUsuario;

    public ErroEnvioEmail(String pMensagemErroAoUsuario) {
        super(pMensagemErroAoUsuario);

        mensagemUsuario = pMensagemErroAoUsuario;
    }

    public String getMensagemUsuario() {
        return mensagemUsuario;
    }

}
