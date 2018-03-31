package com.morsearch.service;

import com.morsearch.model.Base_Rotation;

import java.util.List;

/**
 * Created by ywh on 2018-3-30.
 */
public interface RotationService {

    List<Base_Rotation> getRotationlist(String type);

}
