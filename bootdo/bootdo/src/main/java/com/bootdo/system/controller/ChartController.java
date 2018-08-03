package com.bootdo.system.controller;


import com.bootdo.common.controller.BaseController;
import com.bootdo.common.domain.Charts;
import com.bootdo.common.utils.Dto;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("sys/chart")
public class ChartController extends BaseController {
    @RequestMapping("/zhuzhuang")
    @ResponseBody
    public Dto getZhuZhuang (){
        List<Double> list=new ArrayList<Double>();
        list.add(2.6);
        list.add(5.9);
        list.add(9.0);
        list.add(26.4);
        list.add(28.7);
        list.add(70.7);
        list.add(175.6);
        list.add(182.2);
        list.add(48.7);
        list.add(18.8);
        list.add(6.0);
        list.add(2.3);
        List<Charts> cList=new ArrayList<>();
        Charts charts=new Charts();
        charts.setName("年最高");
        charts.setValue(182.2);
        charts.setxAxis(7.0);
        charts.setyAxis(183.0);
        charts.setSymbolSize(18.0);
        Charts charts1=new Charts();
        charts1.setName("年最低");
        charts1.setValue(2.3);
        charts1.setxAxis(11.0);
        charts1.setyAxis(3.0);
        cList.add(charts);
        cList.add(charts1);
        JSONArray jsonObject = JSONArray.fromObject(cList);
        Dto dto=new Dto();
        dto.put("list",list);
        dto.put("data",jsonObject);
        System.out.println("123");
        return dto;
    }

}
