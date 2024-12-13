/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.crm;

import br.org.coletivoJava.fw.api.erp.crm.email.ErroEnvioEmail;
import com.super_bits.modulosSB.SBCore.modulos.email.ItfServidorEmailAvancado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanArquivo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.comunicacao.ItfBeanEmailSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.contato.ItfBeanContatoSimples;
import java.util.List;
import org.coletivoJava.fw.projetos.Intranet_Marketing_Digital.api.model.ItfTDadoDinamicoCRM;

/**
 *
 * @author salvio
 */
public interface ItfErpCrm {

    public ItfTDadoDinamicoCRM getDadoCRM(String pDocumento, String pnomeDado) throws ErroAcessandoCRM;

    public ItfTDadoDinamicoCRM atualizarDadoCRM(String pDocumento, String pnomeDado, Object pValor) throws ErroAcessandoCRM;

    public String aplicarAssinaturaEMail(ItfUsuario pModeloEmail, String pConteudo);

    public String getModeloEmailPadrao();

    public String iaCorrijaOTexto(String pTExto);

    public String iaMelhoreEsteTexto(String pTexto);

    public String iaMelhoreEsteTExtoFormal(String pTExto);

    public String iaMelhoreEsteTExtoInformal(String pTExto);

    public String getModeloEMail(ItfUsuario pUsuario);

    public void adicionarSlugSubistituicao(String pEntidade, String pCaminhoCampo);

    public String gerarTagLink(String texto, String pLink);

    public boolean enviarEMailAplicandoModeloAssinatura(ItfUsuario pRemetente, ItfBeanEmailSimples pEmail, List<ItfBeanArquivo> pArquivos) throws ErroEnvioEmail;

    public boolean enviarEMailAplicandoModeloAssinatura(ItfUsuario pRemetente, ItfBeanContatoSimples pDestinatario, String assunto, String texto) throws ErroEnvioEmail;

    public ItfServidorEmailAvancado getEMailServer(ItfUsuario pUsuario);

}
