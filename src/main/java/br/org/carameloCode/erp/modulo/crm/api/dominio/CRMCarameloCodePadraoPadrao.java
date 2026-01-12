package br.org.carameloCode.erp.modulo.crm.api.dominio;

import javax.inject.Qualifier;
import br.org.carameloCode.erp.modulo.crm.api.ItfErpCrm;
import com.super_bits.modulosSB.SBCore.modulos.erp.InfoReferenciaApiErp;
import br.org.carameloCode.erp.modulo.crm.api.ERPCrm;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Qualifier
@InfoReferenciaApiErp(tipoObjeto = ERPCrm.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CRMCarameloCodePadraoPadrao {
}