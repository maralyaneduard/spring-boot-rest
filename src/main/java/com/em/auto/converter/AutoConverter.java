package com.em.auto.converter;

import com.em.auto.DTO.AutoDTO;
import com.em.auto.entity.Auto;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardm on 11/17/16.
 */
public class AutoConverter {
    private static final Mapper mapper = new DozerBeanMapper();

    public static AutoDTO fromAuto(Auto auto) {
        if (auto != null) {
            if (auto.getModel().getMake() != null) {
                auto.getModel().getMake().setModels(null);
            }
            return mapper.map(auto, AutoDTO.class);
        }
        return null;
    }

    public static Auto fromAutoDto(AutoDTO autoDTO) {
        return (autoDTO != null) ? mapper.map(autoDTO, Auto.class) : null;
    }

    public static List<AutoDTO> fromAutoList(List<Auto> autos) {
        if (autos != null && autos.size() != 0) {
            List<AutoDTO> autoDTOs = new ArrayList<AutoDTO>();
            for (Auto a : autos) {
                autoDTOs.add(fromAuto(a));
            }
            return autoDTOs;
        }
        return null;
    }


}
