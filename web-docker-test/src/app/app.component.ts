import {Component} from '@angular/core';
import {environment} from "../environment/environment";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title: string = 'web-docker-test';

  constructor(private http: HttpClient) {
  }

  public getMessage(): void {
    this.http.get(environment.BASE_PATH + "/message").subscribe({
      next: (res) => console.log(res)
    });
  }

}
