package com.kl.websocket.datadeal;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

public class ShiJingAnglyasis {
    @Test
    public void dealData(){

        String shijingPath =  "D:\\local\\mycode\\shijing\\json\\shijing.json";
        FileReader fileReader = new FileReader(shijingPath);
        JSONObject shijingJson = JSONUtil.readJSONObject(new File(shijingPath), Charset.defaultCharset());
         String s   shijingJson.values().stream().map(obj -> (JSONObject)obj).map(obj -> obj.getStr("content")).collect(Collectors.joining());

    }
}
