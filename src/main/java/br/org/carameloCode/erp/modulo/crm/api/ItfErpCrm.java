/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.carameloCode.erp.modulo.crm.api;

import br.org.carameloCode.erp.modulo.crm.api.email.ErroEnvioEmail;
import com.super_bits.modulosSB.SBCore.modulos.email.ItfServidorEmailAvancado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoArquivo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.comunicacao.ComoEmailSimples;
import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.contato.ComoContatoSimples;
import jakarta.json.JsonObject;
import java.util.List;
import java.util.Map;
import org.coletivoJava.fw.projetos.Intranet_Marketing_Digital.api.model.ItfTDadoDinamicoCRM;
import org.coletivoJava.fw.projetos.Intranet_Marketing_Digital.api.model.ComoLead;

/**
 *
 * @author salvio
 */
public interface ItfErpCrm {

    public ItfTDadoDinamicoCRM getDadoCRM(String pDocumento, String pnomeDado) throws ErroAcessandoCRM;

    public ItfTDadoDinamicoCRM atualizarDadoCRM(String pDocumento, String pnomeDado, Object pValor) throws ErroAcessandoCRM;

    public String aplicarAssinaturaEMail(ComoUsuario pModeloEmail, String pConteudo);

    public String getModeloEmailPadrao();

    public String iaCorrijaOTexto(String pTExto);

    public String iaMelhoreEsteTexto(String pTexto);

    public String iaMelhoreEsteTExtoFormal(String pTExto);

    public String iaMelhoreEsteTExtoInformal(String pTExto);

    public String getModeloEMail(ComoUsuario pUsuario);

    //public void adicionarSlugSubistituicao(String pEntidade, String pCaminhoCampo);
    public String gerarTagLink(String texto, String pLink);

    public boolean enviarEMailAplicandoModeloAssinatura(ComoUsuario pRemetente, ComoEmailSimples pEmail, List<ComoArquivo> pArquivos) throws ErroEnvioEmail;

    public boolean enviarEMailAplicandoModeloAssinatura(ComoUsuario pRemetente, ComoContatoSimples pDestinatario, String assunto, String texto) throws ErroEnvioEmail;

    public ItfServidorEmailAvancado getEMailServer(ComoUsuario pUsuario) throws ErroEnvioEmail;

    public JsonObject getMedataDadosLead();

    /**
     *
     *
     *
     * @param pPessoa
     * @return todos os marcadores, com seus respectivos valores: exemplo [nome]
     * -> "Joao "
     */
    public Map<String, String> getMarcadoresDeSubstituicao(ComoLead pPessoa);

}
