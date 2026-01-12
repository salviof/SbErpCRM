/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.testes.erp;

import com.super_bits.modulosSB.SBCore.ConfigGeral.ConfiguradorCoreModelSemPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;

/**
 *
 * @author desenvolvedor
 */
public class ConfigCoreApiERPCRM extends ConfiguradorCoreModelSemPersistencia {

    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {
        pConfig.setFabricaDeAcoes((Class<? extends ComoFabricaAcoes>[]) new Class<?>[0]);
    }

}
