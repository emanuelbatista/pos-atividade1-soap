/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.pos.atividade1.soap;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
public class TimeServicePublisher {
    
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8000/ts",new TimeServiceImpl() );
    }

}
