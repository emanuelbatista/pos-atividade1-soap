/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.pos.atividade1.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
public class TimeClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("http://localhost:8000/ts?wsdl");
        QName qName=new QName("http://soap.atividade1.pos.ifpb.edu.br/", "TimeServiceImplService");
        Service service=Service.create(url,qName);
        TimeService timeService=service.getPort(TimeService.class);
        
        System.out.println(timeService.getTimeAsString());
        System.out.println(timeService.getTimeAsElapsed());
    }
}
