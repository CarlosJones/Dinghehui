package com.test;

import com.Application;
import com.school.domain.Idcard;
import com.school.domain.Person;
import com.school.repository.IdcardRepository;
import com.school.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
/**
 * Created by admin on 2017/6/23.
 */
public class TestOneToOne {
    public static final Logger log = LoggerFactory.getLogger(TestOneToOne.class);
    @Bean
    public CommandLineRunner testOneToOne(PersonRepository personRepository, IdcardRepository idcardRepository) {
        return (args) -> {
//            Idcard idcard = new Idcard(3L, "6666");
//            Person p = new Person(1L);
//            p.setIdCard(idcard);
//            idcardRepository.save(idcard);
//            personRepository.save(p);

//            Person p = personRepository.findByPId(1L);
//            Idcard idcard = p.getIdCard();
//            log.info("--------" + idcard.getId() + "----------");

            Idcard idcard = idcardRepository.findByCId(3L);
            Person p = idcard.getPerson();
            log.info("---------" + p.getpId() + "---------");
        };
    }
}
