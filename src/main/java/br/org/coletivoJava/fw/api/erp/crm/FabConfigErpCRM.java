/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.crm;

import com.super_bits.modulosSB.SBCore.ConfigGeral.arquivosConfiguracao.ItfFabConfigModulo;

/**
 *
 * @author salvio
 */
public enum FabConfigErpCRM implements ItfFabConfigModulo {

    URL_ATENDIMENTO,
    URL_AREA_CLIENTE,
    EMAIL_SIMPLE_MAIL_SERVICE_USUARIO,
    EMAIL_SIMPLE_MAIL_SERVICE_SENHA,
    EMAIL_SIMPLE_MAIL_SERVICE_HOSTNAME,
    EMAIL_SIMPLE_MAIL_NOME_REMETENTE,
    EMAIL_SIMPLE_MAIL_EMAIL_REMETENTE,
    CHAVE_CHAT_GPT;

    @Override
    public String getValorPadrao() {
        return "";
    }
}
