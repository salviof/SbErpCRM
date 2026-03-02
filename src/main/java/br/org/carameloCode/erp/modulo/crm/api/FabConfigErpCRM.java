/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.org.carameloCode.erp.modulo.crm.api;

import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ItfFabConfigModulo;

/**
 *
 * @author salvio
 */
public enum FabConfigErpCRM implements ItfFabConfigModulo {

    URL_ATENDIMENTO,
    URL_AREA_CLIENTE,
    EMAIL_USUARIO_AMDIN,
    NOME_USUARIO_ADMIN,
    CHAVE_CHAT_GPT;

    @Override
    public String getValorPadrao() {
        switch (this) {
            case EMAIL_USUARIO_AMDIN:
                return "camila@casanovadigital.com.br";
            case NOME_USUARIO_ADMIN:
                return "Camila Bissiguini";

            default:
                return "";
        }

    }
}
