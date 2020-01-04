# boot-websocket-log
spring boot系统中使用websocket技术实时输出系统日志到浏览器端，因为是实时输出，所有第一时间就想到了使用webSocket,而且在spring boot中，使用websocket超级方便，阅读本文，你会接触到以下关键词相关技术，WebSocket（stopmp服务端），stomp协议，sockjs.min.js，stomp.min.js（stomp客户端），本文使用到的其实就是使用spring boot自带的webSocket模块提供stomp的服务端，前端使用stomp.min.js做stomp的客户端，使用sockjs来链接，前端订阅后端日志端点的消息，后端实时推送，达到日志实时输出到web页面的目的


