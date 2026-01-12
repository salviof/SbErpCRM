package br.org.carameloCode.erp.modulo.crm.api;

/**
 *
 * @author desenvolvedorninja01
 */
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoApiERPCarameloCode;

@InfoApiERPCarameloCode(descricaoApi = "CRMS ERP", usarEstruturaDiretorioLegada = false,
        nomeApi = ERPCrm.NOME_MODULO_ERP, slugInicial = ERPCrm.NOME_MODULO_ERP)
public enum ERPCrm implements ItfApiErpSuperBits<ItfErpCrm> {

    CARAMELO_CODE_PADRAO,
    CARAMELO_CODE_EXTENCAO,
    CARAMELO_CODE_REMOTO,
    SALES_FORCE,
    HUB_SPOT,
    PIPE_DRIVE,
    ZOHO;
    public static final String NOME_MODULO_ERP = "CRM";

    @Override
    public Class<? extends ItfErpCrm> getInterface() {
        return ItfErpCrm.class;
    }
    private static Boolean temExtencaoCaramelo;

    @Override
    public ItfErpCrm getImplementacaoDoContexto() {
        switch (this) {
            case CARAMELO_CODE_EXTENCAO:
                if (temExtencaoCaramelo == null) {
                    ItfErpCrm implementacaoExtencao = ItfApiErpSuperBits.super.getImplementacaoDoContexto();

                    if (implementacaoExtencao == null) {
                        temExtencaoCaramelo = false;
                    } else {
                        return implementacaoExtencao;
                    }
                }
                if (temExtencaoCaramelo) {
                    return ItfApiErpSuperBits.super.getImplementacaoDoContexto();
                }
            case CARAMELO_CODE_PADRAO:
                return ERPCrm.CARAMELO_CODE_PADRAO.getImplementacaoPadraoDoContexto();

            default:
                return ItfApiErpSuperBits.super.getImplementacaoDoContexto();
        }

    }

    public ItfErpCrm getImplementacaoPadraoDoContexto() {
        switch (this) {
            case CARAMELO_CODE_PADRAO:
                return ItfApiErpSuperBits.super.getImplementacaoDoContexto();

            default:
                throw new AssertionError(this.name());

        }

    }

}
