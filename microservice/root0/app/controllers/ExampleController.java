package controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import play.mvc.Controller;
import play.mvc.Result;

@Api(value = "Мой контроллер. Делает много важного и интересного", produces = "application/json", consumes = "application/json")
public class ExampleController extends Controller {

    // обязательная заглушка для Docker-а, должна быть привязана к GET / в файле routes
    @ApiOperation(value = "заглушка для docker", hidden = true)
    public Result index() {
        return ok();
    }

    // обязательная заглушка для Docker-а, должна быть привязана к GET / в файле routes
    @ApiOperation(value = "Hello world", hidden = true)
    public Result hello() {
        return ok("Hello world!");
    }

}
