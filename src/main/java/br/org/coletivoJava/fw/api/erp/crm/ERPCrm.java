/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.crm;

/**
 *
 * @author desenvolvedorninja01
 */
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

@ApiERPColetivoJavaFW(descricaoApi = "CRMS ERP", nomeApi = "CRM", slugInicial = "CRM")
public enum ERPCrm implements ItfApiErpSuperBits<ItfErpCrm> {

    CASA_NOVA_DIGITAL,
    SALES_FORCE;

    @Override
    public Class<? extends ItfErpCrm> getInterface() {
        return ItfErpCrm.class;
    }

}
