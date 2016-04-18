/*
 * Copyright (c) 2016. Alejandro Sánchez.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package com.asy.realmexample.repository.util;

import com.asy.realmexample.model.CarDomain;
import com.asy.realmexample.repository.model.CarDb;
import com.asy.realmexample.util.Mapper;

import javax.inject.Inject;

/**
 * Class Description.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 13/4/16.
 */
public class CarDomainMapper extends Mapper<CarDomain, CarDb> {

    @Inject
    public CarDomainMapper() {
    }

    @Override
    public CarDomain map(CarDb type) {
        return new CarDomain.Builder()
                .setRegistrationDate(type.getRegistrationDate())
                .setModel(type.getModel())
                .setBrand(type.getBrand())
                .setPlateNumber(type.getPlateNumber())
                .build();
    }

    @Override
    public CarDb reverseMap(CarDomain type) {
        return new CarDb.Builder()
                .setRegistrationDate(type.getRegistrationDate())
                .setModel(type.getModel())
                .setBrand(type.getBrand())
                .setPlateNumber(type.getPlateNumber())
                .build();
    }
}
