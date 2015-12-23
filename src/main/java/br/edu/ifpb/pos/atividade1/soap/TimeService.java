/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pos.atividade1.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeService {
    @WebMethod
    String getTimeAsString();

    @WebMethod
    long getTimeAsElapsed();
}
