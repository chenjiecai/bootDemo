$(function () {
    var msg;
    var abc;
    $.ajax({
        url : "/sys/chart/zhuzhuang",
        type : "post",
        async:false,//设置为同步否则无法定义全局变量
        success : function(data) {
            console.log(data);
            msg=data.list;
            abc=data.data;
        }
    });
    var barChart = echarts.init(document.getElementById("echarts-bar-chart"));
    var baroption = {
        title : {
            text: '降水量'
        },
        tooltip : {
            trigger: 'axis'
        },
        legend: {
            data:['降水量']
        },
        grid:{
            x:30,
            x2:40,
            y2:24
        },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'降水量',
                type:'bar',
                //data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],
                data:msg,
                markPoint : {
                    /*data : [
                        {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183, symbolSize:18},
                        {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
                    ]*/
                    data:abc
                },
                markLine : {
                    data : [
                        {type : 'average', name : '平均值'}
                    ]
                }
            }
        ]
    };
    barChart.setOption(baroption);
    window.onresize = barChart.resize;
});
