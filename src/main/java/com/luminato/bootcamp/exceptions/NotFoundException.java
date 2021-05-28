package com.luminato.bootcamp.exceptions;

import com.luminato.bootcamp.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }

}
