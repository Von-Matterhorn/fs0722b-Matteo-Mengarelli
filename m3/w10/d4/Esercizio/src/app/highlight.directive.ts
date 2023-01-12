import { Directive } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(private el:ElementRef,private render:Renderer2) {
    render.setStyle(el.nativeElement,"backgroundColor","yellow")
   }


}
