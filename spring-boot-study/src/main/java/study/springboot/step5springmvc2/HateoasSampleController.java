package study.springboot.step5springmvc2;

import org.springframework.hateoas.Resource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 2019.08.31  Spring HATEOAS 학습
 */
@RestController
public class HateoasSampleController {

    @GetMapping("/hateoas")
    public Resource<HateoasSample> hateoas() {
        HateoasSample hateoasSample = new HateoasSample();
        hateoasSample.setPrefix("Hey,");
        hateoasSample.setName("kyun");

        /** 링크 추가하는 방법   */
        Resource<HateoasSample> hateoasSampleResource = new Resource<>(hateoasSample);  /** 기존 리소스 + 링크 정보 */
        hateoasSampleResource.add(linkTo(methodOn(HateoasSampleController.class).hateoas()).withSelfRel());
        /**  위의 클래스에서 제공하는  hateoas()메소드의 링크를 따서  self라는 relation으로 만들어서 등록한다.   */

        return hateoasSampleResource;
    }

}
